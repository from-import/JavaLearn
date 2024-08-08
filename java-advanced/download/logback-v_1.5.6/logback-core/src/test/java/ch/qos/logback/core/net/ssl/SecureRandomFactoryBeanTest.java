/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2015, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package ch.qos.logback.core.net.ssl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for {@link SecureRandomFactoryBean}.
 *
 * @author Carl Harris
 */
public class SecureRandomFactoryBeanTest {

    private SecureRandomFactoryBean factoryBean = new SecureRandomFactoryBean();

    @Test
    public void testDefaults() throws Exception {
        Assertions.assertNotNull(factoryBean.createSecureRandom());
    }

    @Test
    public void testExplicitProvider() throws Exception {
        SecureRandom secureRandom = SecureRandom.getInstance(SSL.DEFAULT_SECURE_RANDOM_ALGORITHM);
        factoryBean.setProvider(secureRandom.getProvider().getName());
        Assertions.assertNotNull(factoryBean.createSecureRandom());
    }

    @Test
    public void testUnknownProvider() throws Exception {
        factoryBean.setProvider(SSLTestConstants.FAKE_PROVIDER_NAME);
        try {
            factoryBean.createSecureRandom();
            Assertions.fail("expected NoSuchProviderException");
        } catch (NoSuchProviderException ex) {
            Assertions.assertTrue(ex.getMessage().contains(SSLTestConstants.FAKE_PROVIDER_NAME));
        }
    }

    @Test
    public void testUnknownAlgorithm() throws Exception {
        factoryBean.setAlgorithm(SSLTestConstants.FAKE_ALGORITHM_NAME);
        try {
            factoryBean.createSecureRandom();
            Assertions.fail("expected NoSuchAlgorithmException");
        } catch (NoSuchAlgorithmException ex) {
            Assertions.assertTrue(ex.getMessage().contains(SSLTestConstants.FAKE_ALGORITHM_NAME));
        }
    }

}

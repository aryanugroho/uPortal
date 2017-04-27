/**
 * Licensed to Apereo under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright ownership. Apereo
 * licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the License at the
 * following location:
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apereo.portal.security.provider;

import org.apereo.portal.AuthorizationException;
import org.apereo.portal.security.IAuthorizationService;
import org.apereo.portal.security.IAuthorizationServiceFactory;
import org.apereo.portal.spring.locator.AuthorizationServiceLocator;

/**
 * The factory class for the uPortal reference IAuthorizationService implementation.
 *
 * @author Dan Ellentuck
 * @deprecated
 */
@Deprecated
public class AuthorizationServiceFactoryImpl implements IAuthorizationServiceFactory {

    @Override
    public IAuthorizationService getAuthorization() throws AuthorizationException {
        return AuthorizationServiceLocator.getAuthorizationService();
    }
}
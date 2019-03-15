/*
 * Copyright 2005-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ldap.ldif.batch;

import org.springframework.ldap.core.LdapAttributes;

/**
 * This interface should be implemented to map {@link LdapAttributes LdapAttributes} objects to POJOs. The resulting 
 * implementations can be used in the {@link MappingLdifReader MappingLdifReader}.
 * 
 * @author Keith Barlow
 * @deprecated Use the support provided in Spring Batch infrastructure
 *
 * @param <T>
 */
@Deprecated
public interface RecordMapper<T> {

	/**
	 * Maps an {@link LdapAttributes LdapAttributes} object to the specified type.
	 * 
	 * @param attributes
	 * @return object of type T
	 */
	T mapRecord(LdapAttributes attributes);
	
}

/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
  * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
  *      http://www.apache.org/licenses/LICENSE-2.0
  * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
 package org.wso2.developerstudio.eclipse.gmf.esb.providers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;

import org.eclipse.jface.viewers.IFilter;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediatorOutputConnector;

import org.wso2.developerstudio.eclipse.gmf.esb.components.PropertyGroupMediatorOutputConnectorPropertiesEditionComponent;

public class PropertyGroupMediatorOutputConnectorPropertiesEditionProvider extends PropertiesEditingProviderImpl {

    /**
     * Constructor without provider for super types.
     */
    public PropertyGroupMediatorOutputConnectorPropertiesEditionProvider() {
        super();
    }

    /**
     * Constructor with providers for super types.
     * @param superProviders providers to use for super types.
     */
    public PropertyGroupMediatorOutputConnectorPropertiesEditionProvider(
            List<PropertiesEditingProvider> superProviders) {
        super(superProviders);
    }

    /**
     * {@inheritDoc}
     * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
     */
    public boolean provides(PropertiesEditingContext editingContext) {
        return (editingContext.getEObject() instanceof PropertyMediatorOutputConnector)
                && (EsbPackage.Literals.PROPERTY_MEDIATOR_OUTPUT_CONNECTOR == editingContext.getEObject().eClass());
    }

    /**
     * {@inheritDoc} 
     * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
     *      java.lang.String) 
     */
    public boolean provides(PropertiesEditingContext editingContext, String part) {
        return (editingContext.getEObject() instanceof PropertyMediatorOutputConnector)
                && (PropertyGroupMediatorOutputConnectorPropertiesEditionComponent.BASE_PART.equals(part));
    }

    /**
     * {@inheritDoc}
     * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
     *      java.lang.Class) 
     */
    @SuppressWarnings("rawtypes")
    public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
        return (editingContext.getEObject() instanceof PropertyMediatorOutputConnector)
                && (refinement == PropertyGroupMediatorOutputConnectorPropertiesEditionComponent.class);
    }

    /**
     * {@inheritDoc}
     * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
     *      java.lang.String, java.lang.Class)
     */
    @SuppressWarnings("rawtypes")
    public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
        return (editingContext.getEObject() instanceof PropertyMediatorOutputConnector)
                && ((PropertyGroupMediatorOutputConnectorPropertiesEditionComponent.BASE_PART.equals(part)
                        && refinement == PropertyGroupMediatorOutputConnectorPropertiesEditionComponent.class));
    }

    /**
     * {@inheritDoc}
     * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
     *      java.lang.String)
     */
    public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext,
            String mode) {
        if (editingContext.getEObject() instanceof PropertyMediatorOutputConnector) {
            return new PropertyGroupMediatorOutputConnectorPropertiesEditionComponent(editingContext,
                    editingContext.getEObject(), mode);
        }
        return super.getPropertiesEditingComponent(editingContext, mode);
    }

    /**
     * {@inheritDoc}
     * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
     *      java.lang.String, java.lang.String)
     */
    public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext,
            String mode, String part) {
        if (editingContext.getEObject() instanceof PropertyMediatorOutputConnector) {
            if (PropertyGroupMediatorOutputConnectorPropertiesEditionComponent.BASE_PART.equals(part))
                return new PropertyGroupMediatorOutputConnectorPropertiesEditionComponent(editingContext,
                        editingContext.getEObject(), mode);
        }
        return super.getPropertiesEditingComponent(editingContext, mode, part);
    }

    /**
     * {@inheritDoc}
     * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
     *      java.lang.String, java.lang.String, java.lang.Class)
     */
    @SuppressWarnings("rawtypes")
    public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext,
            String mode, String part, java.lang.Class refinement) {
        if (editingContext.getEObject() instanceof PropertyMediatorOutputConnector) {
            if (PropertyGroupMediatorOutputConnectorPropertiesEditionComponent.BASE_PART.equals(part)
                    && refinement == PropertyGroupMediatorOutputConnectorPropertiesEditionComponent.class)
                return new PropertyGroupMediatorOutputConnectorPropertiesEditionComponent(editingContext,
                        editingContext.getEObject(), mode);
        }
        return super.getPropertiesEditingComponent(editingContext, mode, part, refinement);
    }

    /**
     * Provides the filter used by the plugin.xml to assign part forms.
     */
    public static class EditionFilter implements IFilter {

        /**
         * {@inheritDoc}
         * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
         */
        public boolean select(Object toTest) {
            EObject eObj = EEFUtils.resolveSemanticObject(toTest);
            return eObj != null && EsbPackage.Literals.PROPERTY_MEDIATOR_OUTPUT_CONNECTOR == eObj.eClass();
        }
    }
}

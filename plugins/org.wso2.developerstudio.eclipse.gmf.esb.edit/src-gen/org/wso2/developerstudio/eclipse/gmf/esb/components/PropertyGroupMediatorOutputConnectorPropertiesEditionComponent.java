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
package org.wso2.developerstudio.eclipse.gmf.esb.components;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.wso2.developerstudio.eclipse.gmf.esb.CommentMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.EsbViewsRepository;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.PropertyGroupMediatorOutputConnectorPropertiesEditionPart;

public class PropertyGroupMediatorOutputConnectorPropertiesEditionComponent
        extends SinglePartPropertiesEditingComponent {

    public static String BASE_PART = "Base"; //$NON-NLS-1$

    /**
     * Settings for commentMediators ReferencesTable
     */
    protected ReferencesTableSettings commentMediatorsSettings;

    /**
     * Default constructor
     * 
     */
    public PropertyGroupMediatorOutputConnectorPropertiesEditionComponent(PropertiesEditingContext editingContext,
            EObject propertyMediatorOutputConnector, String editing_mode) {
        super(editingContext, propertyMediatorOutputConnector, editing_mode);
        parts = new String[] { BASE_PART };
        repositoryKey = EsbViewsRepository.class;
        partKey = EsbViewsRepository.PropertyGroupMediatorOutputConnector.class;
    }

    /**
     * {@inheritDoc}
     * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int,
     *      org.eclipse.emf.ecore.EObject,
     *      org.eclipse.emf.ecore.resource.ResourceSet)
     */
    public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
        setInitializing(true);
        if (editingPart != null && key == partKey) {
            editingPart.setContext(elt, allResource);

            final PropertyMediatorOutputConnector propertyMediatorOutputConnector = (PropertyMediatorOutputConnector) elt;
            final PropertyGroupMediatorOutputConnectorPropertiesEditionPart basePart = (PropertyGroupMediatorOutputConnectorPropertiesEditionPart) editingPart;
            // init values
            if (isAccessible(EsbViewsRepository.PropertyGroupMediatorOutputConnector.Properties.commentMediators)) {
                commentMediatorsSettings = new ReferencesTableSettings(propertyMediatorOutputConnector,
                        EsbPackage.eINSTANCE.getOutputConnector_CommentMediators());
                basePart.initCommentMediators(commentMediatorsSettings);
            }
            // init filters
            if (isAccessible(EsbViewsRepository.PropertyGroupMediatorOutputConnector.Properties.commentMediators)) {
                basePart.addFilterToCommentMediators(new ViewerFilter() {
                    /**
                     * {@inheritDoc}
                     * 
                     * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
                     *      java.lang.Object, java.lang.Object)
                     */
                    public boolean select(Viewer viewer, Object parentElement, Object element) {
                        return (element instanceof String && element.equals("")) //$NON-NLS-1$
                                || (element instanceof CommentMediator);
                    }
                });
                // Start of user code for additional businessfilters for commentMediators
                // End of user code
            }
            // init values for referenced views

            // init filters for referenced views
            
        }
        setInitializing(false);
    }

    /**
     * {@inheritDoc}
     * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
     */
    public EStructuralFeature associatedFeature(Object editorKey) {
        if (editorKey == EsbViewsRepository.PropertyGroupMediatorOutputConnector.Properties.commentMediators) {
            return EsbPackage.eINSTANCE.getOutputConnector_CommentMediators();
        }
        return super.associatedFeature(editorKey);
    }

    /**
     * {@inheritDoc}
     * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
     */
    public void updateSemanticModel(final IPropertiesEditionEvent event) {
        PropertyMediatorOutputConnector propertyMediatorOutputConnector = (PropertyMediatorOutputConnector) semanticObject;
        if (EsbViewsRepository.PropertyGroupMediatorOutputConnector.Properties.commentMediators == event
                .getAffectedEditor()) {
            if (event.getKind() == PropertiesEditionEvent.ADD) {
                EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext,
                        this, commentMediatorsSettings, editingContext.getAdapterFactory());
                PropertiesEditingProvider provider = (PropertiesEditingProvider) editingContext.getAdapterFactory()
                        .adapt(semanticObject, PropertiesEditingProvider.class);
                if (provider != null) {
                    PropertiesEditingPolicy policy = provider.getPolicy(context);
                    if (policy instanceof CreateEditingPolicy) {
                        policy.execute();
                    }
                }
            } else if (event.getKind() == PropertiesEditionEvent.EDIT) {
                EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this,
                        (EObject) event.getNewValue(), editingContext.getAdapterFactory());
                PropertiesEditingProvider provider = (PropertiesEditingProvider) editingContext.getAdapterFactory()
                        .adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
                if (provider != null) {
                    PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
                    if (editionPolicy != null) {
                        editionPolicy.execute();
                    }
                }
            } else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
                commentMediatorsSettings.removeFromReference((EObject) event.getNewValue());
            } else if (event.getKind() == PropertiesEditionEvent.MOVE) {
                commentMediatorsSettings.move(event.getNewIndex(), (CommentMediator) event.getNewValue());
            }
        }
    }

    /**
     * {@inheritDoc}
     * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
     */
    public void updatePart(Notification msg) {
        super.updatePart(msg);
        if (editingPart.isVisible()) {
            PropertyGroupMediatorOutputConnectorPropertiesEditionPart basePart = (PropertyGroupMediatorOutputConnectorPropertiesEditionPart) editingPart;
            if (EsbPackage.eINSTANCE.getOutputConnector_CommentMediators().equals(msg.getFeature()) && isAccessible(
                    EsbViewsRepository.PropertyGroupMediatorOutputConnector.Properties.commentMediators))
                basePart.updateCommentMediators();
        }
    }

    /**
     * {@inheritDoc}
     * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
     */
    @Override
    protected NotificationFilter[] getNotificationFilters() {
        NotificationFilter filter = new EStructuralFeatureNotificationFilter(
                EsbPackage.eINSTANCE.getOutputConnector_CommentMediators());
        return new NotificationFilter[] { filter, };
    }

    /**
     * {@inheritDoc}
     * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
     */
    public Diagnostic validateValue(IPropertiesEditionEvent event) {
        Diagnostic ret = Diagnostic.OK_INSTANCE;
        if (event.getNewValue() != null) {
            try {
            } catch (IllegalArgumentException iae) {
                ret = BasicDiagnostic.toDiagnostic(iae);
            } catch (WrappedException we) {
                ret = BasicDiagnostic.toDiagnostic(we);
            }
        }
        return ret;
    }
}

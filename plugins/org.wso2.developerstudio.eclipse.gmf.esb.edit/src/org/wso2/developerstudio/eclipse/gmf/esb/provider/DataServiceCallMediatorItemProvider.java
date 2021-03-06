/**
 * Copyright 2009-2012 WSO2, Inc. (http://wso2.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.developerstudio.eclipse.gmf.esb.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.wso2.developerstudio.eclipse.gmf.esb.DataServiceCallMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;

/**
 * This is the item provider adapter for a {@link org.wso2.developerstudio.eclipse.gmf.esb.DataServiceCallMediator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataServiceCallMediatorItemProvider extends MediatorItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataServiceCallMediatorItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors != null) {
        	itemPropertyDescriptors.clear();
        }
        super.getPropertyDescriptors(object);

        addDSNamePropertyDescriptor(object);
        addOperationTypePropertyDescriptor(object);
        addOperationNamePropertyDescriptor(object);
        addTargetTypePropertyDescriptor(object);
        addPropertyNamePropertyDescriptor(object);
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the DS Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDSNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataServiceCallMediator_DSName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataServiceCallMediator_DSName_feature", "_UI_DataServiceCallMediator_type"),
                 EsbPackage.Literals.DATA_SERVICE_CALL_MEDIATOR__DS_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Operation Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperationTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataServiceCallMediator_operationType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataServiceCallMediator_operationType_feature", "_UI_DataServiceCallMediator_type"),
                 EsbPackage.Literals.DATA_SERVICE_CALL_MEDIATOR__OPERATION_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Operation Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperationNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataServiceCallMediator_OperationName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataServiceCallMediator_OperationName_feature", "_UI_DataServiceCallMediator_type"),
                 EsbPackage.Literals.DATA_SERVICE_CALL_MEDIATOR__OPERATION_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Target Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataServiceCallMediator_targetType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataServiceCallMediator_targetType_feature", "_UI_DataServiceCallMediator_type"),
                 EsbPackage.Literals.DATA_SERVICE_CALL_MEDIATOR__TARGET_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Property Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPropertyNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DataServiceCallMediator_PropertyName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DataServiceCallMediator_PropertyName_feature", "_UI_DataServiceCallMediator_type"),
                 EsbPackage.Literals.DATA_SERVICE_CALL_MEDIATOR__PROPERTY_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(EsbPackage.Literals.DATA_SERVICE_CALL_MEDIATOR__INPUT_CONNECTOR);
            childrenFeatures.add(EsbPackage.Literals.DATA_SERVICE_CALL_MEDIATOR__OUTPUT_CONNECTOR);
            childrenFeatures.add(EsbPackage.Literals.DATA_SERVICE_CALL_MEDIATOR__OPERATIONS);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns DataServiceCallMediator.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public Object getImage(Object object) {
    	return overlayImage(object, getResourceLocator().getImage("full/obj16/DSCallMediator.png"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((DataServiceCallMediator)object).getDSName();
        return label == null || label.length() == 0 ?
            getString("_UI_DataServiceCallMediator_type") :
            getString("_UI_DataServiceCallMediator_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(DataServiceCallMediator.class)) {
            case EsbPackage.DATA_SERVICE_CALL_MEDIATOR__DS_NAME:
            case EsbPackage.DATA_SERVICE_CALL_MEDIATOR__OPERATION_TYPE:
            case EsbPackage.DATA_SERVICE_CALL_MEDIATOR__OPERATION_NAME:
            case EsbPackage.DATA_SERVICE_CALL_MEDIATOR__TARGET_TYPE:
            case EsbPackage.DATA_SERVICE_CALL_MEDIATOR__PROPERTY_NAME:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case EsbPackage.DATA_SERVICE_CALL_MEDIATOR__INPUT_CONNECTOR:
            case EsbPackage.DATA_SERVICE_CALL_MEDIATOR__OUTPUT_CONNECTOR:
            case EsbPackage.DATA_SERVICE_CALL_MEDIATOR__OPERATIONS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (EsbPackage.Literals.DATA_SERVICE_CALL_MEDIATOR__INPUT_CONNECTOR,
                 EsbFactory.eINSTANCE.createDataServiceCallMediatorInputConnector()));

        newChildDescriptors.add
            (createChildParameter
                (EsbPackage.Literals.DATA_SERVICE_CALL_MEDIATOR__OUTPUT_CONNECTOR,
                 EsbFactory.eINSTANCE.createDataServiceCallMediatorOutputConnector()));

        newChildDescriptors.add
            (createChildParameter
                (EsbPackage.Literals.DATA_SERVICE_CALL_MEDIATOR__OPERATIONS,
                 EsbFactory.eINSTANCE.createOperation()));
    }

}

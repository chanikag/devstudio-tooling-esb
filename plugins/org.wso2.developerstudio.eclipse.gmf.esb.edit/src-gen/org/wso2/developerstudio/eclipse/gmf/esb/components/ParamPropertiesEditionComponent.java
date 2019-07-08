/**
 * Generated with Acceleo
 */
package org.wso2.developerstudio.eclipse.gmf.esb.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.MediaType;
import org.wso2.developerstudio.eclipse.gmf.esb.Param;
import org.wso2.developerstudio.eclipse.gmf.esb.PayloadFactoryArgumentType;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.EsbViewsRepository;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.ParamPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ParamPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ParamPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject param, String editing_mode) {
		super(editingContext, param, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EsbViewsRepository.class;
		partKey = EsbViewsRepository.Param.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final Param param = (Param)elt;
			final ParamPropertiesEditionPart basePart = (ParamPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EsbViewsRepository.Param.Properties.paramName))
				basePart.setParamName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, param.getParamName()));
			
			if (isAccessible(EsbViewsRepository.Param.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, param.getType()));
			
			if (isAccessible(EsbViewsRepository.Param.Properties.paramValueType)) {
				basePart.initParamValueType(EEFUtils.choiceOfValues(param, EsbPackage.eINSTANCE.getParam_ParamValueType()), param.getParamValueType());
			}
			if (isAccessible(EsbViewsRepository.Param.Properties.paramValue))
				basePart.setParamValue(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, param.getParamValue()));
			
			if (isAccessible(EsbViewsRepository.Param.Properties.evauator)) {
				basePart.initEvauator(EEFUtils.choiceOfValues(param, EsbPackage.eINSTANCE.getParam_Evauator()), param.getEvauator());
			}
			// Start of user code  for ParamExpression command update
			// End of user code
			
			// init filters
			
			
			
			
			
			// Start of user code  for ParamExpression filter update
			// End of user code
			
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
		if (editorKey == EsbViewsRepository.Param.Properties.paramName) {
			return EsbPackage.eINSTANCE.getParam_ParamName();
		}
		if (editorKey == EsbViewsRepository.Param.Properties.type) {
			return EsbPackage.eINSTANCE.getParam_Type();
		}
		if (editorKey == EsbViewsRepository.Param.Properties.paramValueType) {
			return EsbPackage.eINSTANCE.getParam_ParamValueType();
		}
		if (editorKey == EsbViewsRepository.Param.Properties.paramValue) {
			return EsbPackage.eINSTANCE.getParam_ParamValue();
		}
		if (editorKey == EsbViewsRepository.Param.Properties.evauator) {
			return EsbPackage.eINSTANCE.getParam_Evauator();
		}
		if (editorKey == EsbViewsRepository.Param.Properties.expressionView) {
			return EsbPackage.eINSTANCE.getParam_ParamExpression();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Param param = (Param)semanticObject;
		if (EsbViewsRepository.Param.Properties.paramName == event.getAffectedEditor()) {
			param.setParamName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EsbViewsRepository.Param.Properties.type == event.getAffectedEditor()) {
			param.setType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EsbViewsRepository.Param.Properties.paramValueType == event.getAffectedEditor()) {
			param.setParamValueType((PayloadFactoryArgumentType)event.getNewValue());
		}
		if (EsbViewsRepository.Param.Properties.paramValue == event.getAffectedEditor()) {
			param.setParamValue((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EsbViewsRepository.Param.Properties.evauator == event.getAffectedEditor()) {
			param.setEvauator((MediaType)event.getNewValue());
		}
		if (EsbViewsRepository.Param.Properties.expressionView == event.getAffectedEditor()) {
			// Start of user code for updateParamExpression method body
			// End of user code
			
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ParamPropertiesEditionPart basePart = (ParamPropertiesEditionPart)editingPart;
			if (EsbPackage.eINSTANCE.getParam_ParamName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EsbViewsRepository.Param.Properties.paramName)) {
				if (msg.getNewValue() != null) {
					basePart.setParamName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setParamName("");
				}
			}
			if (EsbPackage.eINSTANCE.getParam_Type().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EsbViewsRepository.Param.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			if (EsbPackage.eINSTANCE.getParam_ParamValueType().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(EsbViewsRepository.Param.Properties.paramValueType))
				basePart.setParamValueType((PayloadFactoryArgumentType)msg.getNewValue());
			
			if (EsbPackage.eINSTANCE.getParam_ParamValue().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EsbViewsRepository.Param.Properties.paramValue)) {
				if (msg.getNewValue() != null) {
					basePart.setParamValue(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setParamValue("");
				}
			}
			if (EsbPackage.eINSTANCE.getParam_Evauator().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(EsbViewsRepository.Param.Properties.evauator))
				basePart.setEvauator((MediaType)msg.getNewValue());
			
					// Start of user code for ParamExpression live update
					
					// End of user code
			
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			EsbPackage.eINSTANCE.getParam_ParamName(),
			EsbPackage.eINSTANCE.getParam_Type(),
			EsbPackage.eINSTANCE.getParam_ParamValueType(),
			EsbPackage.eINSTANCE.getParam_ParamValue(),
			EsbPackage.eINSTANCE.getParam_Evauator(),
			EsbPackage.eINSTANCE.getParam_ParamExpression()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (EsbViewsRepository.Param.Properties.paramName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EsbPackage.eINSTANCE.getParam_ParamName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EsbPackage.eINSTANCE.getParam_ParamName().getEAttributeType(), newValue);
				}
				if (EsbViewsRepository.Param.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EsbPackage.eINSTANCE.getParam_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EsbPackage.eINSTANCE.getParam_Type().getEAttributeType(), newValue);
				}
				if (EsbViewsRepository.Param.Properties.paramValueType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EsbPackage.eINSTANCE.getParam_ParamValueType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EsbPackage.eINSTANCE.getParam_ParamValueType().getEAttributeType(), newValue);
				}
				if (EsbViewsRepository.Param.Properties.paramValue == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EsbPackage.eINSTANCE.getParam_ParamValue().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EsbPackage.eINSTANCE.getParam_ParamValue().getEAttributeType(), newValue);
				}
				if (EsbViewsRepository.Param.Properties.evauator == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EsbPackage.eINSTANCE.getParam_Evauator().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EsbPackage.eINSTANCE.getParam_Evauator().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}

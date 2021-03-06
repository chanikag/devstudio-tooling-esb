/**
 * Generated with Acceleo
 */
package org.wso2.developerstudio.eclipse.gmf.esb.parts.forms;

// Start of user code for imports
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.wso2.developerstudio.eclipse.gmf.esb.parts.AbstractNameValueParamPropertiesEditionPart;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.EsbViewsRepository;

import org.wso2.developerstudio.eclipse.gmf.esb.providers.EsbMessages;

// End of user code

/**
 * 
 * 
 */
public class AbstractNameValueParamPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, AbstractNameValueParamPropertiesEditionPart {

	protected Text paramName;
	protected Text paramValue;



	/**
	 * For {@link ISection} use only.
	 */
	public AbstractNameValueParamPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AbstractNameValueParamPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence abstractNameValueParamStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = abstractNameValueParamStep.addStep(EsbViewsRepository.AbstractNameValueParam.Properties.class);
		propertiesStep.addStep(EsbViewsRepository.AbstractNameValueParam.Properties.paramName);
		propertiesStep.addStep(EsbViewsRepository.AbstractNameValueParam.Properties.paramValue);
		
		
		composer = new PartComposer(abstractNameValueParamStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EsbViewsRepository.AbstractNameValueParam.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.AbstractNameValueParam.Properties.paramName) {
					return createParamNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.AbstractNameValueParam.Properties.paramValue) {
					return createParamValueText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EsbMessages.AbstractNameValueParamPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createParamNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.AbstractNameValueParam.Properties.paramName, EsbMessages.AbstractNameValueParamPropertiesEditionPart_ParamNameLabel);
		paramName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		paramName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData paramNameData = new GridData(GridData.FILL_HORIZONTAL);
		paramName.setLayoutData(paramNameData);
		paramName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							AbstractNameValueParamPropertiesEditionPartForm.this,
							EsbViewsRepository.AbstractNameValueParam.Properties.paramName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, paramName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									AbstractNameValueParamPropertiesEditionPartForm.this,
									EsbViewsRepository.AbstractNameValueParam.Properties.paramName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, paramName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									AbstractNameValueParamPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		paramName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AbstractNameValueParamPropertiesEditionPartForm.this, EsbViewsRepository.AbstractNameValueParam.Properties.paramName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, paramName.getText()));
				}
			}
		});
		EditingUtils.setID(paramName, EsbViewsRepository.AbstractNameValueParam.Properties.paramName);
		EditingUtils.setEEFtype(paramName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.AbstractNameValueParam.Properties.paramName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createParamNameText

		// End of user code
		return parent;
	}

	
	protected Composite createParamValueText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.AbstractNameValueParam.Properties.paramValue, EsbMessages.AbstractNameValueParamPropertiesEditionPart_ParamValueLabel);
		paramValue = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		paramValue.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData paramValueData = new GridData(GridData.FILL_HORIZONTAL);
		paramValue.setLayoutData(paramValueData);
		paramValue.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							AbstractNameValueParamPropertiesEditionPartForm.this,
							EsbViewsRepository.AbstractNameValueParam.Properties.paramValue,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, paramValue.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									AbstractNameValueParamPropertiesEditionPartForm.this,
									EsbViewsRepository.AbstractNameValueParam.Properties.paramValue,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, paramValue.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									AbstractNameValueParamPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		paramValue.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AbstractNameValueParamPropertiesEditionPartForm.this, EsbViewsRepository.AbstractNameValueParam.Properties.paramValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, paramValue.getText()));
				}
			}
		});
		EditingUtils.setID(paramValue, EsbViewsRepository.AbstractNameValueParam.Properties.paramValue);
		EditingUtils.setEEFtype(paramValue, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.AbstractNameValueParam.Properties.paramValue, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createParamValueText

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.AbstractNameValueParamPropertiesEditionPart#getParamName()
	 * 
	 */
	public String getParamName() {
		return paramName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.AbstractNameValueParamPropertiesEditionPart#setParamName(String newValue)
	 * 
	 */
	public void setParamName(String newValue) {
		if (newValue != null) {
			paramName.setText(newValue);
		} else {
			paramName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.AbstractNameValueParam.Properties.paramName);
		if (eefElementEditorReadOnlyState && paramName.isEnabled()) {
			paramName.setEnabled(false);
			paramName.setToolTipText(EsbMessages.AbstractNameValueParam_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !paramName.isEnabled()) {
			paramName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.AbstractNameValueParamPropertiesEditionPart#getParamValue()
	 * 
	 */
	public String getParamValue() {
		return paramValue.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.AbstractNameValueParamPropertiesEditionPart#setParamValue(String newValue)
	 * 
	 */
	public void setParamValue(String newValue) {
		if (newValue != null) {
			paramValue.setText(newValue);
		} else {
			paramValue.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.AbstractNameValueParam.Properties.paramValue);
		if (eefElementEditorReadOnlyState && paramValue.isEnabled()) {
			paramValue.setEnabled(false);
			paramValue.setToolTipText(EsbMessages.AbstractNameValueParam_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !paramValue.isEnabled()) {
			paramValue.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EsbMessages.AbstractNameValueParam_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

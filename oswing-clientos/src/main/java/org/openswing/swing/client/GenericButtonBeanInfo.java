package org.openswing.swing.client;

import java.beans.*;

/**
 * <p>Title: OpenSwing Framework</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (C) 2006 Mauro Carniel</p>
 * <p> </p>
 * @author not attributable
 * @version 1.0
 */

public class GenericButtonBeanInfo extends SimpleBeanInfo {
  Class beanClass = GenericButton.class;
  String iconColor16x16Filename = "GenericButton16.png";
  String iconColor32x32Filename = "GenericButton.png";
  String iconMono16x16Filename = "GenericButton16.png";
  String iconMono32x32Filename = "GenericButton.png";

  public GenericButtonBeanInfo() {
  }
  public PropertyDescriptor[] getPropertyDescriptors() {
    try {
      PropertyDescriptor _buttonBehavior = new PropertyDescriptor("buttonBehavior", beanClass, "getButtonBehavior", "setButtonBehavior");
      _buttonBehavior.setPropertyEditorClass(org.openswing.swing.client.ButtonBehaviorEditor.class);
      PropertyDescriptor _buttonId = new PropertyDescriptor("buttonId", beanClass, "getButtonId", "setButtonId");
      PropertyDescriptor _enabled = new PropertyDescriptor("enabled", beanClass, "isEnabled", "setEnabled");
      PropertyDescriptor _executeAsThread = new PropertyDescriptor("executeAsThread", beanClass, "isExecuteAsThread", "setExecuteAsThread");
      PropertyDescriptor _attributeName = new PropertyDescriptor("attributeName", beanClass, "getAttributeName", "setAttributeName");
      _attributeName.setPropertyEditorClass(StringAttributeNameEditor.class);
      PropertyDescriptor[] pds = new PropertyDescriptor[] {
        _buttonBehavior,
        _buttonId,
        _enabled,
        _executeAsThread,
        _attributeName
      };
      return pds;
    }
    catch(IntrospectionException ex) {
      ex.printStackTrace();
      return null;
    }
  }
  public java.awt.Image getIcon(int iconKind) {
    switch (iconKind) {
      case BeanInfo.ICON_COLOR_16x16:
        return iconColor16x16Filename != null ? loadImage(iconColor16x16Filename) : null;
      case BeanInfo.ICON_COLOR_32x32:
        return iconColor32x32Filename != null ? loadImage(iconColor32x32Filename) : null;
      case BeanInfo.ICON_MONO_16x16:
        return iconMono16x16Filename != null ? loadImage(iconMono16x16Filename) : null;
      case BeanInfo.ICON_MONO_32x32:
        return iconMono32x32Filename != null ? loadImage(iconMono32x32Filename) : null;
    }
    return null;
  }
}

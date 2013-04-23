package org.openswing.swing.form.client;

import java.util.*;

import org.openswing.swing.message.receive.java.*;


/**
 * <p>Title: OpenSwing Framework</p>
 * <p>Description: Form controller, used to listener events generated by the Form panel and to execute operations related to the form (for example loading data).</p>
 * <p>Copyright: Copyright (C) 2006 Mauro Carniel</p>
 *
 * <p> This file is part of OpenSwing Framework.
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the (LGPL) Lesser General Public
 * License as published by the Free Software Foundation;
 *
 *                GNU LESSER GENERAL PUBLIC LICENSE
 *                 Version 2.1, February 1999
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the Free
 * Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *
 *       The author may be contacted at:
 *           maurocarniel@tin.it</p>
 *
 * @author Mauro Carniel
 * @version 1.0
 */
public class FormController {


  /**
   * Method called by the Form panel to insert new data.
   * @param newValueObject value object to save
   * @return an ErrorResponse value object in case of errors, VOResponse if the operation is successfully completed
   */
  public Response insertRecord(ValueObject newPersistentObject) throws Exception {
    throw new java.lang.UnsupportedOperationException("Method insertRecord() not yet implemented.");
  }

  /**
   * Method called by the Form panel to update existing data.
   * @param oldPersistentObject original value object, previous to the changes
   * @param persistentObject value object to save
   * @return an ErrorResponse value object in case of errors, VOResponse if the operation is successfully completed
   */
  public Response updateRecord(ValueObject oldPersistentObject,ValueObject persistentObject) throws Exception {
    throw new java.lang.UnsupportedOperationException("Method updateRecord() not yet implemented.");
  }

  /**
   * Method called by the Form panel to delete existing data.
   * @param persistentObject value object to delete
   * @return an ErrorResponse value object in case of errors, VOResponse if the operation is successfully completed
   */
  public Response deleteRecord(ValueObject persistentObject) throws Exception {
    throw new java.lang.UnsupportedOperationException("Method deleteRecord() not yet implemented.");
  }

  /**
   * Callback method called by the Form panel when the Form is set to INSERT mode.
   * The method can pre-set some v.o. attributes, so that some input controls will have a predefined value associated.
   * @param persistentObject new value object
   */
  public void createPersistentObject(ValueObject PersistentObject) throws Exception { }


  /**
   * Callback method called when the data loading is completed.
   * @param error <code>true</code> if an error occours during data loading, <code>false</code> if data loading is successfully completed
   */
  public void loadDataCompleted(boolean error) {

  }


  /**
   * @author Matheus Antonelli &lt;matheus.antonelli@gmail.com&gt;
   * 
   * Callback method called when user has presses on reload button.
   * 
   */
  public boolean beforeReloadData() {
	  return true;
  }
  
  /**
   * Callback method called when user has pressed on reload button.
   */
  public void afterReloadData() {
  }


  /**
   * Callback method called after saving SUCCESSFULLY data in EDIT mode.
   */
  public void afterEditData() {
  }


  /**
   * Callback method called after saving SUCCESSFULLY data in INSERT mode.
   */
  public void afterInsertData() {
  }


  /**
   * Callback method called after deleting SUCCESSFULLY data.
   */
  public void afterDeleteData() {
  }


  /**
   * This method must be overridden by the subclass to retrieve data and return the valorized value object.
   * If the method is not overridden, the current version will return a "demo" value object.
   * @param valueObjectClass value object class
   * @return a VOResponse object if data loading is successfully completed, or an ErrorResponse object if an error occours
   */
  public Response loadData(Class valueObjectClass) {
    try {
      // create an empty value object...
      Object vo = valueObjectClass.newInstance();
      // set demo data in the value object just created...
      for (int i = 0; i < valueObjectClass.getMethods().length; i++) {
        if (valueObjectClass.getMethods()[i].getName().startsWith("set")) {
          valueObjectClass.getMethod(valueObjectClass.getMethods()[i].getName(),valueObjectClass.getMethods()[i].getParameterTypes()).invoke(vo,new Object[]{getObject(valueObjectClass.getMethods()[i].getParameterTypes()[0])});
        }
      }
      VOResponse r = new VOResponse(vo);
      return r;
    }
    catch (Exception ex) {
      return new ErrorResponse("Error on creating the demo value object:\n"+ex.toString());
    }
  }


  /**
   * Help method called by loadData method to create demo data.
   * @param type v.o. attribute class
   * @return demo data
   */
  private Object getObject(Class type) {
    if (type.equals(String.class))
      return "ABC";
    if (type.equals(Date.class))
      return new Date();
    if (type.equals(java.sql.Date.class))
      return new java.sql.Date(System.currentTimeMillis());
    if (type.equals(java.sql.Timestamp.class))
      return new java.sql.Timestamp(System.currentTimeMillis());
    if (type.equals(Long.class) || type.equals(Long.TYPE))
      return new Long(1);
    if (type.equals(Short.class) || type.equals(Short.TYPE))
      return Short.valueOf("1");
    if (type.equals(Integer.class) || type.equals(Integer.TYPE))
      return new Integer(1);
    if (type.equals(Float.class) || type.equals(Float.TYPE))
      return new Float(1.2);
    if (type.equals(Double.class) || type.equals(Double.TYPE))
      return new Double(1.2);
    if (type.equals(java.math.BigDecimal.class))
      return new java.math.BigDecimal(1.2);
    if (type.equals(Boolean.class))
      return new Boolean(true);
    else
      return null;
  }


  /**
   * Callback method called when the Form mode is changed.
   * @param currentMode current Form mode
   */
  public void modeChanged(int currentMode) { }


  /**
   * Callback method invoked on pressing SAVE button, before invoking updateRecord method.
   * It can be used to interrupt saving operation.
   * @return <code>true</code> allows to continue saving operation, <code>false</code> ti interrupt saving operation
   */
  public boolean beforeSaveDataInEdit(Form form) {
    return true;
  }


  /**
   * Callback method invoked on pressing SAVE button, before invoking insertRecord method.
   * It can be used to interrupt saving operation.
   * @return <code>true</code> allows to continue saving operation, <code>false</code> ti interrupt saving operation
   */
  public boolean beforeSaveDataInInsert(Form form) {
    return true;
  }

  /**
   * Callback method invoked on pressing SAVE button, after invoking insertRecord or updateRecord methods.
   */
  public void afterSaveData(Form form) {}

  /**
   * Callback method invoked on pressing EDIT button to check if edit mode is allowed.
   * @return <code>true</code> allows to go to EDIT mode, <code>false</code> the mode change is interrupted
   */
  public boolean beforeEditData(Form form) {
    return true;
  }


  /**
   * Callback method invoked on pressing INSERT button to check if insert mode is allowed.
   * @return <code>true</code> allows to go to INSERT mode, <code>false</code> the mode change is interrupted
   */
  public boolean beforeInsertData(Form form) {
    return true;
  }


  /**
   * Callback method invoked before deleting data when the form was in READONLY mode (on pressing delete button).
   * @return <code>true</code> allows the deleting to continue, <code>false</code> the deleting is interrupted
   */
  public boolean beforeDeleteData(Form form) {
    return true;
  }


  /**
   * Callback method invoked on pressing EDIT button, after changing to edit mode.
   */
  public void afterEditData(Form form) {}


  /**
   * Callback method invoked on pressing INSERT button, after changing to insert mode.
   */
  public void afterInsertData(Form form) {}


  /**
   * Callback method invoked each time an input control is edited: this method define if the new value if valid.
   * Default behaviour: input control value is valid.
   * @param attributeName attribute name related to the input control currently edited
   * @param oldValue old input control value (before editing)
   * @param newValue new input control value (just edited)
   * @return <code>true</code> if input control value is valid, <code>false</code> otherwise
   */
  public boolean validateControl(String attributeName,Object oldValue,Object newValue) {
    return true;
  }


}

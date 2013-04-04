package org.openswing.swing.message.receive.java;





/**
 * <p>Title: OpenSwing Framework</p>
 * <p>Description: Message returned by the server side: it represents an error.</p>
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
public class ErrorResponse extends Response {

  /** error message */
  private String errorMessage = null;
  private Throwable throwable = null;

  public ErrorResponse(String errorMessage) {
    this.errorMessage = errorMessage;
  }
  
  public ErrorResponse(String errorMessage, Throwable throwable) {
	  this.errorMessage = errorMessage;
	  this.throwable    = throwable;
  }

/**
   * @return <code>true</code>: an error occours
   */
  public final boolean isError() {
    return true;
  }


  /**
   * @return error message
   */
  public final String getErrorMessage() {
    return errorMessage;
  }


}

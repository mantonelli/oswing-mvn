package org.openswing.swing.mdi.client;

import java.util.*;


/**
 * <p>Title: OpenSwing Framework</p>
 * <p>Description: Hashtable combined with list.</p>
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
public class WindowsList extends Hashtable {

  /** list of JInternalFrame added in chronological order */
  private ArrayList list = new ArrayList();


  public final Object remove(Object key) {
    list.remove(key);
    return super.remove(key);
  }


  /**
   * @return list of keys
   */
  public final ArrayList getList() {
    return list;
  }


  /**
   * Put entry <JInternalFrame,JMenuItem> in hastablr and in list.
   * @param key JInternalFrame
   * @param value JMenuItem
   */
  public final Object put(Object key,Object value) {
    if (!containsKey(key))
      list.add(key);
    return super.put(key,value);
  }


}

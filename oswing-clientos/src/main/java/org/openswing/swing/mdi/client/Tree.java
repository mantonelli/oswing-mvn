package org.openswing.swing.mdi.client;

import java.awt.*;
import javax.swing.*;

import org.openswing.swing.util.client.*;


/**
 * <p>Title: OpenSwing Framework</p>
 * <p>Description: Tree Menu.
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
public class Tree extends JTree {

  /** background image */
  private Image backImage = ClientSettings.TREE_BACK!=null ? ClientUtils.getImage(ClientSettings.TREE_BACK) : null;


  public Tree() {
    super();
    this.setOpaque(false);
  }


  /**
   * Paint the background image
   */
  public void paintComponent(Graphics g) {
    if (backImage!=null) {
      int imgWidth = backImage.getWidth(this);
      int imgHeight = backImage.getHeight(this);
      for(int i=0;i<this.getWidth();i=i+imgWidth)
        for(int j=0;j<this.getHeight();j=j+imgHeight)
          g.drawImage(backImage,i,j,this);
    }
    super.paintComponent(g);
  }


}

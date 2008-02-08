/*
 * GwtExt - Gwt Ext Integration library.
 *
 * Copyright (c) 2007, Sanjiv Jivan
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package com.gwtext.client.widgets.tree.event;

import com.gwtext.client.widgets.tree.TreeLoader;
import com.gwtext.client.widgets.tree.TreeNode;

public interface TreeLoaderListener {

    /**
     * Fires before a network request is made to retrieve the Json text which specifies a node's children.
     * 
     * @param self this
     * @param node the node
     * @return false to cancel
     */
    boolean doBeforeLoad(TreeLoader self, TreeNode node);

    /**
     * Fires when the node has been successfuly loaded.
     * 
     * @param self this
     * @param node the node
     * @param response  the response text containing the data from the server
     */
    void onLoad(TreeLoader self, TreeNode node, String response);

    /**
     * Fires if the network request failed.
     * 
     * @param self this
     * @param node the node
     * @param response the response  containing the data from the server
     */
    void onLoadException(TreeLoader self, TreeNode node, String response);
}

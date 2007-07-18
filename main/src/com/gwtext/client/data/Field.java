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

package com.gwtext.client.data;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwtext.client.core.JsObject;

public abstract class Field extends JsObject {
    protected static native void setConverter(JavaScriptObject config, Converter converter)/*-{
        config['convert'] = function(s) {
            return converter.@com.gwtext.client.data.Converter::format(Ljava/lang/String;)(s);
        }
   }-*/;

    //not adding sortType to API as combination of data type and renderer accomplishes
    //sort type behavior
    //http://extjs.com/forum/showthread.php?t=1853
    /*public void setSortType(String sortType) {
        setSortType(jsObj, sortType);
    }

    private native void setSortType(JavaScriptObject config, String sortType) *//*-{
        config['sortType'] = sortType;
    }-*//*;*/


}
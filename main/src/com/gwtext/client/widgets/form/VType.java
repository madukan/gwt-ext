/*
 * GWT-Ext Widget Library
 * Copyright 2007 - 2008, GWT-Ext LLC., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
 

package com.gwtext.client.widgets.form;

import com.gwtext.client.core.RegExp;


//http://extjs.com/forum/showthread.php?t=4271&highlight=vtype
/**
 * Basic pre-created validation types. Overridable validation definitions. The validations provided are basic and
 * intended to be easily customizable and extended.
 *
 * @author Sanjiv Jivan
 * @see com.gwtext.client.widgets.form.TextField#setVtype(VType)
 */
public class VType {

    private String vType;

    private VType(String vType) {
        this.vType = vType;
    }

    public String getVType() {
        return vType;
    }

    /**
     * The function used to validate alpha values
     */
    public static VType ALPHA = new VType("alpha");

    /**
     * The function used to validate alphanumeric values.
     */
    public static VType ALPHANUM = new VType("alphanum");

    /**
     * The function used to validate email addresses.
     */
    public static VType EMAIL = new VType("email");

    /**
     * The function used to validate URLs.
     */
    public static VType URL = new VType("url");

    /**
     * The error text to display when the alpha validation function returns false.
     *
     * @param alphaText error message
     */
    public static native void setAlphaText(String alphaText)/*-{
         $wnd.Ext.form.VTypes.alphaText = alphaText;
    }-*/;

    /**
     * The keystroke filter mask to be applied on alpha input.
     *
     * @param alphaMask the alpha mask
     */
    public static native void setAlphaMask(RegExp alphaMask)/*-{
        var re = alphaMask.@com.gwtext.client.core.JsObject::getJsObj()();
        $wnd.Ext.form.VTypes.alphaMask = re;
    }-*/;

    /**
     * The error text to display when the alphanumeric validation function returns false.
     *
     * @param alphanumText the error message
     */
    public static native void setAlphanumText(String alphanumText)/*-{
         $wnd.Ext.form.VTypes.alphanumText = alphanumText;
    }-*/;

    /**
     * The keystroke filter mask to be applied on alphanumeric input.
     *
     * @param alphanumMask the alpha num mask
     */
    public static native void setAlphanumMask(RegExp alphanumMask)/*-{
        var re = alphanumMask.@com.gwtext.client.core.JsObject::getJsObj()();
        $wnd.Ext.form.VTypes.alphanumMask = re;
    }-*/;

    /**
     * The error text to display when the email validation function returns false.
     *
     * @param emailText the error message
     */
    public static native void setEmailText(String emailText)/*-{
         $wnd.Ext.form.VTypes.emailText = emailText;
    }-*/;

    /**
     * The keystroke filter mask to be applied on email input.
     *
     * @param emailMask the email mask
     */
    public static native void setEmailMask(RegExp emailMask)/*-{
        var re = emailMask.@com.gwtext.client.core.JsObject::getJsObj()();
        $wnd.Ext.form.VTypes.emailMask = re;
    }-*/;

    /**
     * The error text to display when the url validation function returns false.
     *
     * @param urlText the error message
     */
    public static native void setUrlText(String urlText)/*-{
         $wnd.Ext.form.VTypes.urlText = urlText;
    }-*/;

}

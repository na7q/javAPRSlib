/*
 * javAPRSlib - https://github.com/ab0oo/javAPRSlib
 *
 * Copyright (C) 2011, 2024 John Gorkos, AB0OO
 *
 * javAPRSlib is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation; either version 2 of the License,
 * or (at your option) any later version.
 *
 * javAPRSlib is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this software; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 */

package net.ab0oo.aprs.parser;

/**
 * <p>ParseResult class.</p>
 *
 * @author john
 * @version $Id: $Id
 */
public class ParseResult {
    private boolean hasFault;
    private String faultString = "";

    /**
     * <p>Constructor for ParseResult.</p>
     *
     * @param _hasFault a boolean
     * @param _faultString a {@link java.lang.String} object
     */
    public ParseResult( boolean _hasFault, String _faultString ) {
        this.hasFault = _hasFault;
        this.faultString = _faultString;
    }
    
    /**
     * return boolean true if a fault was detected during parsing
     *
     * @return a boolean
     */
    public boolean hasFault() {
        return hasFault;
    }

    /**
     * return String the root cause of any decoding faults
     */
    String getFaultString() {
        return faultString;
    }
}

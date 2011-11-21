/*FreeMind - A Program for creating and viewing Mindmaps
 *Copyright (C) 2000-2001  Joerg Mueller <joergmueller@bigfoot.com>
 *See COPYING for Details
 *
 *This program is free software; you can redistribute it and/or
 *modify it under the terms of the GNU General Public License
 *as published by the Free Software Foundation; either version 2
 *of the License, or (at your option) any later version.
 *
 *This program is distributed in the hope that it will be useful,
 *but WITHOUT ANY WARRANTY; without even the implied warranty of
 *MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *GNU General Public License for more details.
 *
 *You should have received a copy of the GNU General Public License
 *along with this program; if not, write to the Free Software
 *Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
/*$Id$*/

package freemind.controller;

import java.awt.dnd.DropTargetListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Externalizable;

import javax.swing.KeyStroke;

import freemind.main.Tools;

/**
 * The KeyListener which belongs to the node and cares for Events like C-D
 * (Delete Node). It forwards the requests to NodeController.
 */
public class NodeKeyListener implements KeyListener {

    private Controller c;

    private KeyListener mListener;

    public NodeKeyListener(Controller controller) {
        c = controller;
    }

    public void register(KeyListener listener) {
        this.mListener = listener;

    }

    public void deregister() {
        mListener = null;
    }

    public void keyPressed(KeyEvent e) {
        if (mListener != null)
            mListener.keyPressed(e);
    }

    public void keyReleased(KeyEvent e) {
        if (mListener != null)
            mListener.keyReleased(e);
    }

    public void keyTyped(KeyEvent e) {
        if (mListener != null)
            mListener.keyTyped(e);
    }

}

/**
 *
 * Copyright (c) 2009-2015 Freedomotic Team http://www.freedomotic-platform.com
 * 
* This file is part of Freedomotic
 * 
* This Program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2, or (at your option) any later version.
 * 
* This Program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
* You should have received a copy of the GNU General Public License along with
 * Freedomotic; see the file COPYING. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.freedomotic.plugins.devices.openwebnet;

import com.freedomotic.exceptions.UnableToExecuteException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauro Cicolella
 */
public class OWNFrame extends javax.swing.JFrame {

    OpenWebNet pluginReference;

    /**
     * Creates new form OWNFrame
     */
    public OWNFrame(OpenWebNet pluginReference) {
        this.pluginReference = pluginReference;
        initComponents();
    }

    public static void writeAreaLog(String text) {
        monitorLogTextArea.append(text + "\n");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        monitorLogTextArea = new javax.swing.JTextArea();
        jScrollMonitorLog = new javax.swing.JScrollPane();
        monitorLogArea = new javax.swing.JTextArea();
        jTextOwnFrame = new javax.swing.JTextField();
        SendFrameButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OpenWebNet Plugin");

        monitorLogTextArea.setColumns(20);
        monitorLogTextArea.setEditable(false);
        monitorLogTextArea.setRows(5);
        jScrollPane1.setViewportView(monitorLogTextArea);

        jTabbedPane1.addTab("Monitor Log", jScrollPane1);

        monitorLogArea.setColumns(20);
        monitorLogArea.setEditable(false);
        monitorLogArea.setRows(5);
        jScrollMonitorLog.setViewportView(monitorLogArea);

        jTabbedPane1.addTab("Gateway", jScrollMonitorLog);

        jTextOwnFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextOwnFrameActionPerformed(evt);
            }
        });

        SendFrameButton.setText("Send");
        SendFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendFrameButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Send frame");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextOwnFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SendFrameButton))
                            .addComponent(jLabel1))
                        .addGap(0, 179, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextOwnFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SendFrameButton))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SendFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendFrameButtonActionPerformed
        pluginReference.ownHandler.inviaComandoOpen((String) jTextOwnFrame.getText());
        
    }//GEN-LAST:event_SendFrameButtonActionPerformed

    private void jTextOwnFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextOwnFrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextOwnFrameActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SendFrameButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollMonitorLog;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextOwnFrame;
    private static javax.swing.JTextArea monitorLogArea;
    private static javax.swing.JTextArea monitorLogTextArea;
    // End of variables declaration//GEN-END:variables
}

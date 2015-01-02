/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yccheok.jstock.gui.options;

import org.yccheok.jstock.portfolio.BrokingFirm;

/**
 *
 * @author Test
 */
public class PortFolioOptions {
    private BrokingFirm broker;

    public BrokingFirm getBroker() {
        return broker;
    }

    public void setBroker(BrokingFirm broker) {
        this.broker = broker;
    }
}

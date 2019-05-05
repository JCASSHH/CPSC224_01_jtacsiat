/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

/**
 *
 * @author jtacs
 */
public class EndGame extends Icons{

    public boolean SpikeDied()
    {
        int spikeX = spikeLabel.getX();
        int spikeY = spikeLabel.getY();
        int auburnX = auburnLabel.getX();
        int auburnY = auburnLabel.getY();
        int dukeX = dukeLabel.getX();
        int dukeY = dukeLabel.getY();
        int kentuckyX = kentuckyLabel.getX();
        int kentuckyY = kentuckyLabel.getY();
        int michiganX = michiganLabel.getX();
        int michiganY = michiganLabel.getY();
        int texasX = texasLabel.getX();
        int texasY = texasLabel.getY();
        int virginiaX = virginiaLabel.getX();
        int virginiaY = virginiaLabel.getY();

        if(spikeX == auburnX)
        {
            if(spikeY == auburnY)
            {
                return true;
            }
        }
        if(spikeX == dukeX)
        {
            if(spikeY == dukeY)
            {
                return true;
            }
        }
        if(spikeX == kentuckyX)
        {
            if(spikeY == kentuckyY)
            {
                return true;
            }
        }
        if(spikeX == michiganX)
        {
            if(spikeY == michiganY)
            {
                return true;
            }
        }
        if(spikeX == texasX)
        {
            if(spikeY == texasY)
            {
                return true;
            }
        }
        if(spikeX == virginiaX)
        {
            if(spikeY == virginiaY)
            {
                return true;
            }
        }
		
       return false;
    }
    
}


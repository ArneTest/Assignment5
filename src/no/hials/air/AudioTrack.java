/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.hials.air;

import java.time.Duration;

/**
 * Represents a sound track containing audio. This is an abstract class
 * not to be made object instances of.
 * 
 * @author asty
 */
public class AudioTrack {
    private Duration duration;  //The duration of the track, in seconds
    private String title;

    public void setDuration(long minutes, long seconds)
    {
        this.duration = Duration.ofSeconds(seconds).plusMinutes(minutes);
    } 
    
    public void setDuration (Duration duration)
    {
        this.duration = duration;
    }
    
    public Duration getDuration()
    {
        return this.duration;
    
    }
    
    public String getDurationAsString()
    {
        long s = this.duration.getSeconds();
        return String.format("%02d:%02d:%02d",s/3600, (s%3600)/60, (s%60));
    }
    
    public static void main(String[] args)
    {
        AudioTrack st = new AudioTrack();
        
        
        
        st.setDuration(125, 34);
        System.out.println("Duration (hh:mm:ss): " + st.getDurationAsString());
    }

}

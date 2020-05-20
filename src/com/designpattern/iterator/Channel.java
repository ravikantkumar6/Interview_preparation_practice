package com.designpattern.iterator;

public class Channel {

    private final double frequency;
    private final ChannelTypeEnum channelType;

    public Channel(double freuency, ChannelTypeEnum channelType) {
        this.frequency = freuency;
        this.channelType = channelType;
    }

    public double getFrequency() {
        return frequency;
    }


    public ChannelTypeEnum getChannelType() {
        return channelType;
    }

    public String toString() {
        return "Frequency=" + this.frequency + ",channelType=" + this.channelType;
    }


}

package com.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection{
	
	private List<Channel> channelList;
	
	public ChannelCollectionImpl() {
		channelList = new ArrayList<Channel>();
	}

	@Override
	public void addChannel(Channel channel) {
		this.channelList.add(channel);
		
	}

	@Override
	public void removeChannel(Channel channel) {
		this.channelList.add(channel);
		
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl(type,this.channelList);
	}
	
	private class ChannelIteratorImpl implements ChannelIterator{
		
		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;
		
		public ChannelIteratorImpl(ChannelTypeEnum type,List<Channel> channels) {
			this.type = type;
			this.channels = channels;
		}

		@Override
		public boolean hasNext() {
			while(position < channels.size()) {
				Channel channel = channels.get(position);
				if(channel.getChannelType().equals(type) || type.equals(ChannelTypeEnum.ALL)) return true;
				else position++;
			}
			return false;
		}

		@Override
		public Channel next() {
			 return channels.get(position++);
		}
		
		
	}

}

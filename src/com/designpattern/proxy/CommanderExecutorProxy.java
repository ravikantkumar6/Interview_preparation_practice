package com.designpattern.proxy;

public class CommanderExecutorProxy implements CommandExecutor{
	
	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommanderExecutorProxy(String userName,String pwd) {
		if(userName.equals("user") && pwd.equals("pass"))
			isAdmin = true;
		executor = new CommandExecutorImpl();
	}

	public void runCommand(String command) throws Exception {
		if(isAdmin) {
			executor.runCommand(command);
		}else {
			if(command.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for non-admin users.");
			}else{
				executor.runCommand(command);
			}
		}
		
		
	}

}

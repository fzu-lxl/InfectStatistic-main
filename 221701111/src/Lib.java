/**
 * Lib
 * TODO
 *
 * @author xxx
 * @version xxx
 * @since xxx
 */
public class Lib {
	
	/**
	 * CommandLine
	 * TODO
	 *
	 * @author 疾饭饭
	 * @version 1.0
	 * @since 2020.2.7
	 * @state 命令行实体类：命令+命令行参数
	 * 命令：list
	 * 命令行参数：-log -out
	 */
	static class CommandLine {
		
		private Command command;
		
		private Parameters parameters;
		
		public Command getCommand() {
            return command;
        }
		
		public void setCommand(Command command) {
            this.command = command;
        }
		
		public Parameters getParameters() {
            return parameters;
        }
		
		public void setParameters(Parameters parameters) {
            this.parameters = parameters;
        }
		
		/**
		 * Command
		 * TODO
		 *
		 * @author 疾饭饭
		 * @version 1.0
		 * @since 2020.2.7
		 * @state 命令类
		 * 命令：list
		 */
		static class Command {
			
			//list 命令
			private boolean list;
			
			public boolean isList() {
				return list;
			}
			
			public void setList(boolean list) {
				this.list = list;
			}
		}
		
		/**
		 * Parameters
		 * TODO
		 *
		 * @author 疾饭饭
		 * @version 1.0
		 * @since 2020.2.7
		 * @state 命令行参数类
		 * 命令行参数：-log -out
		 */		
		static class Parameters {
			
			private boolean log;
			
			private String log_content;
			
			private boolean out;
			
			private String out_content;
			
			public boolean isLog() {
				return log;
			}
			
			public void setLog(boolean log) {
				this.log=log;
			}
			
			public String getLog_content() {
				return log_content;
			}
			
			public void setLog_content(String log_content) {
				this.log_content = log_content;
			}
			
			public boolean isOut() {
				return out;
			}
			
			public void setOut(boolean out) {
				this.out=out;
			}
			
			public String getOut_content() {
				return out_content;
			}
			
			public void setOut_content(String out_content) {
				this.out_content = out_content;
			}
		}
	}
	
	
}

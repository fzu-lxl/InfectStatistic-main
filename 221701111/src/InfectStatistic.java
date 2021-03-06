import java.util.List;

/**
 * InfectStatistic
 * TODO
 *
 * @author xxx
 * @version xxx
 * @since xxx
 */
class InfectStatistic {
	/**
	 * CmdLine
	 * TODO
	 *
	 * @author 疾饭饭
	 * @version 1.0
	 * @since 2020.2.7
	 * @state 命令行实体类：命令+命令行参数
	 * 命令：list
	 * 命令行参数：-log -out
	 */
	static class CmdLine {
		
		//命令
		private Command command;
		
		//命令行参数
		private Parameters parameters;
		
		public Command getCmd() {
            return command;
        }
		
		public void setCmd(Command command) {
            this.command = command;
        }
		
		public Parameters getPrms() {
            return parameters;
        }
		
		public void setPrms(Parameters parameters) {
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
			
			//输入
			private boolean log;
			
			//输入路径
			private String log_path;
			
			//输出
			private boolean out;
			
			//输出路径
			private String out_path;
			
			public boolean isLog() {
				return log;
			}
			
			public void setLog(boolean log) {
				this.log = log;
			}
			
			public String getLog_path() {
				return log_path;
			}
			
			public void setLog_path(String log_path) {
				this.log_path = log_path;
			}
			
			public boolean isOut() {
				return out;
			}
			
			public void setOut(boolean out) {
				this.out = out;
			}
			
			public String getOut_path() {
				return out_path;
			}
			
			public void setOut_path(String out_path) {
				this.out_path = out_path;
			}
		}
	}
	
	/**
	 * CmdLineParse
	 * TODO
	 *
	 * @author 疾饭饭
	 * @version 1.0
	 * @since 2020.2.7
	 * @state 命令行解析类
	 * 命令行参数：-log -out
	 */		
	static class CmdLineParse {
		
		/**
		 * Parse
		 * TODO
		 *
		 * @author 疾饭饭
		 * @version 1.0
		 * @since 2020.2.7
		 * @state 命令行解析功能
		 */
		public CmdLine Parse(List<String> list) {
			
			//命令行
			CmdLine CmdLine = new CmdLine();
			
			//命令
			CmdLine.Command command = new CmdLine.Command();
			
			//命令行参数
			CmdLine.Parameters parameters = new CmdLine.Parameters();
			
			for (int i = 0;i<list.size();i++) {
				
				//获取命令行当前可读字符
				String temp = list.get(i);
				
				switch (temp) {
				
				//读取list命令
                case "list":
                    command.setList(true);
                    break;
                    
                //读取log参数
                case "-log":
                	parameters.setLog(true);
                	parameters.setLog_path(list.get(i + 1));
                    break;
                    
                //读取out参数
                case "-out":
                	parameters.setOut(true);
                	parameters.setOut_path(list.get(i + 1));
                    break;
				}
			}
			CmdLine.setCmd(command);
			CmdLine.setPrms(parameters);
			return CmdLine;
			
		}
		
	}
	
    public static void main(String[] args) {
        System.out.println("helloworld");
    }
}

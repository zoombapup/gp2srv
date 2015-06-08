package x.mvmn.gp2srv.service.gphoto2.command;

import x.mvmn.gp2srv.service.ExecService.ExecResult;
import x.mvmn.log.api.Logger;

public class GP2CmdSummary extends AbstractGPhoto2Command<String> {

	protected final String[] COMMAND_STR = { "--summary" };

	public GP2CmdSummary(final Logger logger) {
		super(logger);
	}

	public String[] getCommandString() {
		return COMMAND_STR;
	}

	@Override
	protected String processExecResultInternal(final ExecResult execResult) {
		return execResult.getStandardOutput();
	}
}

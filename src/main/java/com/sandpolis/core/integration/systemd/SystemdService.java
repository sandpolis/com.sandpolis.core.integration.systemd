package com.sandpolis.core.integration.systemd;

import java.nio.file.Path;
import java.util.function.Consumer;

import com.sandpolis.core.foundation.S7SProcess;

public record SystemdService(Path path, String Type, boolean RemainAfterExit) {

	public static enum Type {
		SIMPLE, EXEC, FORKING, ONESHOT, DBUS, NOTIFY, IDLE;
	}

	public static enum Restart {
		NO, ALWAYS, ON_SUCCESS, ON_FAILURE, ON_ABNORMAL, ON_ABORT, ON_WATCHDOG;
	}

	public static enum OOMPolicy {
		CONTINUE, STOP, KILL;
	}

	public static class SystemdServiceStruct {
		public Type Type;
		public boolean RemainAfterExit;
		public boolean GuessMainPID;
		public Path PIDFile;
		public String BusName;
		public String[] ExecStart;
		public String[] ExecStartPre;
		public String[] ExecStartPost;
		public String[] ExecCondition;
		public String[] ExecReload;
		public String[] ExecStop;
		public String[] ExecStopPost;
		public int RestartSec;
		public int TimeoutStartSec;
		public int TimeoutStopSec;
		public int TimeoutAbortSec;
		public int TimeoutSec;
		public int RuntimeMaxSec;
		public int WatchdogSec;
		public Restart Restart;
		public int[] SuccessExitStatus;
		public int[] RestartPreventExitStatus;
		public int[] RestartForceExitStatus;
		public boolean RootDirectoryStartOnly;
		public boolean NonBlocking;
		public int FileDescriptorStoreMax;
		public OOMPolicy OOMPolicy = SystemdService.OOMPolicy.CONTINUE;
	}

	public static SystemdService of(Consumer<SystemdServiceStruct> configurator) {
		
		return null;
	}
	
	public static SystemdService of(Path service) {
		return null;
	}

}
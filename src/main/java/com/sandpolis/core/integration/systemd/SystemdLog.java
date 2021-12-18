package com.sandpolis.core.integration.systemd;

import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sandpolis.core.foundation.S7SProcess;

public record SystemdLog(Path log) {

	public Stream<?> stream() throws IOException {
		new ObjectMapper().createParser(S7SProcess.exec("journalctl", "-o", "json").process().getInputStream());
		return null;
	}
}

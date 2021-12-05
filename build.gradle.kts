//============================================================================//
//                                                                            //
//                         Copyright © 2015 Sandpolis                         //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPL    //
//  as published by the Mozilla Foundation.                                   //
//                                                                            //
//============================================================================//

plugins {
	id("java-library")
	id("com.sandpolis.build.module")
	id("com.sandpolis.build.publish")
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.+")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.+")

	// https://github.com/FasterXML/jackson-databind
	implementation("com.fasterxml.jackson.core:jackson-databind:2.12.4")

	if (project.getParent() == null) {
		implementation("com.sandpolis:core.foundation:+")
	} else {
		implementation(project(":core:com.sandpolis.core.foundation"))
	}
}

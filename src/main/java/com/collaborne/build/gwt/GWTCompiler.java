/**
 * Copyright (C) 2015 Collaborne B.V. (opensource@collaborne.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.collaborne.build.gwt;

import org.apache.tools.ant.taskdefs.Javac;
import org.apache.tools.ant.types.Commandline;
import org.eclipse.jdt.core.JDTCompilerAdapter;

/**
 * Compiler adapter for GWT development.
 * 
 * Usage:
 * <ol>
 * <li>Add the gwt-compiler-adapter dependency to the run configuration</li>
 * <li>Set {@code -Dbuild.compiler=com.collaborne.build.gwt.GWTCompiler}</li>
 * </ol>
 * 
 * @author david@smartmediamarketing.net
 * @author andreas.kohn@collaborne.com 
 * @see <a href="https://github.com/gwtproject/gwt/issues/4170">GWT Issue 4170</a>
 */
public class GWTCompiler extends JDTCompilerAdapter {
	@Override
	public void setJavac(Javac attributes) {
		if (attributes.getTarget() == null) {
			attributes.setTarget("1.7");
		}
		if (attributes.getSource() == null) {
			attributes.setSource("1.7");
		}

		super.setJavac(attributes);
	}

	@Override
	protected Commandline setupJavacCommand() {
		// Enable verbose mode early
		this.verbose = true;

		return super.setupJavacCommand();
	}
	
	@Override
	protected void logAndAddFilesToCompile(Commandline cmd) {
		super.logAndAddFilesToCompile(cmd);
		
		// Eclipse ECJ specific options to get even more details
		cmd.createArgument().setValue("-progress");
		cmd.createArgument().setValue("-showversion");
		
		System.out.println(cmd.toString());
	}
}

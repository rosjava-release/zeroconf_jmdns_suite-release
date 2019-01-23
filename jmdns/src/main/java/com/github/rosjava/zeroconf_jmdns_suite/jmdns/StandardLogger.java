/*
 * Copyright (C) 2013 Yujin Robot.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.github.rosjava.zeroconf_jmdns_suite.jmdns;

import java.lang.String;

/**
 * A standard logger (to System.out.println) that can be
 * passed to the Zeroconf class.
 */
public class StandardLogger implements ZeroconfLogger {
	public void println(String msg) {
		System.out.println(msg);
	}
}

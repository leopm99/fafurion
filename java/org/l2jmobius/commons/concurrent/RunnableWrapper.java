/*
 * This file is part of the L2J Mobius project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.l2jmobius.commons.concurrent;

import java.util.logging.Logger;

import org.l2jmobius.Config;

/**
 * @author Mobius
 */
public class RunnableWrapper implements Runnable
{
	private static final Logger LOGGER = Logger.getLogger(RunnableWrapper.class.getName());
	
	private final Runnable _runnable;
	
	public RunnableWrapper(Runnable runnable)
	{
		_runnable = runnable;
	}
	
	@Override
	public void run()
	{
		try
		{
			_runnable.run();
		}
		catch (Exception e)
		{
			LOGGER.warning(e.getMessage() + Config.EOL + e.getStackTrace());
		}
	}
}

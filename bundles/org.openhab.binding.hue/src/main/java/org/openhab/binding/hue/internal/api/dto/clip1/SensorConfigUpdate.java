/**
 * Copyright (c) 2010-2023 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.hue.internal.api.dto.clip1;

import static org.openhab.binding.hue.internal.api.dto.clip1.FullSensor.CONFIG_ON;

/**
 * Collection of updates to the sensor configuration.
 *
 * @author Christoph Weitkamp - Initial contribution
 */
public class SensorConfigUpdate extends ConfigUpdate {
    /**
     *
     * @param onOff
     */
    public void setOn(boolean onOff) {
        commands.add(new Command(CONFIG_ON, onOff));
    }
}

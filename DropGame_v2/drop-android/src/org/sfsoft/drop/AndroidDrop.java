package org.sfsoft.drop;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

/**
 * Clase principal para la versión Android del proyecto
 * @author Santiago Faci
 * @version 2.0
 *
 */
public class AndroidDrop extends AndroidApplication {
	public void onCreate (android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		AndroidApplicationConfiguration configuracion = new AndroidApplicationConfiguration();
		configuracion.useAccelerometer = false;
		configuracion.useCompass = false;
		
		initialize(new Drop(), configuracion);
	}
}
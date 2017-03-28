public class Cerc implements Figura{

	@Override	
	public float perimetru(float raza){

		if(raza < 0){
			throw new NullPointerException;
		}

		return (float) 2 * Math.PI * raza;
	}

	@Override
	public float aria(float raza){

		if(raza < 0){
			throw new NullPointerException;
		}

		return (float) Math.PI * pow((float)raza, 2.0);
	}

	public float ariaSectorCerc(float raza, float unghi){

		if(raza < 0 || unghi < 0 || unghi > 360){
			throw new NullPointerException;
		}

		return (float) (Math.PI * pow((float)raza, 2.0) * unghi) / 360.0;
	}

	public float lungimeaCoardei(float raza, float unghi){

		if(raza < 0 || unghi < 0 || unghi > 360){
			throw new NullPointerException;
		}

		if(unghi > 180){
			return (float) 2 * raza * Math.sin((float)(360 - unghi) / 2.0);
		}else{
			return (float) 2 * raza * Math.sin((float)unghi / 2.0);
		}
	}
}
package general;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	//	AudioFileFormat.Type[] tipos = AudioSystem.getAudioFileTypes();
	//	for(AudioFileFormat.Type tipo : tipos)
	//		System.out.println(tipo.getExtension());

		Clip sonido = AudioSystem.getClip();
		
		sonido.open(AudioSystem.getAudioInputStream(new File("Proyecto/general/audio1.wav")));
		
		sonido.start();
		
		while(true) {
			sonido.loop(Clip.LOOP_CONTINUOUSLY);
		}
		
	
		
	}

}
public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //in built support to play mp2 music file
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        //Media Adapter is providing support to play other file format
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}

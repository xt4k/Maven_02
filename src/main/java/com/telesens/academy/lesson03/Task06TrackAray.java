package com.telesens.academy.lesson03;

class Task06TrackArray {
    public static void main(String[] args) {
        int trackNumber;
        String[] tracks = {"track_01", "track_03", "track_21", "track_15", "track_12", "track_99", "track_11", "track_10"};
        for (String track : tracks) {
            System.out.println(track);
        }
        System.out.println("==========");

        for (int i = 0; i < tracks.length; i++) {
            trackNumber = Integer.parseInt(tracks[i].substring(tracks[i].length()-2));
            if (trackNumber>=10&&trackNumber<=15 ) System.out.println(tracks[i]);
        }

    }
}

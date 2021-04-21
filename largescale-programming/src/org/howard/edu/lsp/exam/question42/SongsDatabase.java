package org.howard.edu.lsp.exam.question42;

import java.util.*;

public class SongsDatabase  {

    private Map<String, Set<String>> genreMap = new HashMap<String, Set<String>>();
    
        public void addSong(String genre, String songTitle) {
    
            // You must implement this method
            if(genreMap.containsKey(genre)){
                genreMap.get(genre).add(songTitle);//adding songTitle with genre
            }else{
                //making a new set when the genre does not exist and adding it to the hashmap
                Set<String> newSet = new HashSet<String>();
                newSet.add(songTitle);
                genreMap.put(genre,newSet);
            }
    
        }
    
        public Set<String> getSongs(String genre) {
    
            // You must implement this method
            return genreMap.get(genre);//returning the set corresponding to the genre
    
        }
    
        public String getGenreOfSong(String songTitle) {
    
            // You must implement this method
            for (Map.Entry<String, Set<String>> entry : genreMap.entrySet()) {
                
                if(entry.getValue().contains(songTitle)){
                    return entry.getKey();
                }
            
            }

            return "No value found";
    
        }

        public static void main(String args[]){
        	SongsDatabase  db = new SongsDatabase ();

            //adding songs
        	System.out.println("Added Savage to Rap");
            db.addSong("Rap","Savage");
            System.out.println("Added Gin and Juice to Rap");
            db.addSong("Rap","Gin and Juice");
            System.out.println("Added Always There to Jazz");
            db.addSong("Jazz","Always There");
            

        
            
            
            System.out.println("Genre of Savage : ");
            System.out.println(db.getGenreOfSong("Savage")); 
            System.out.println("Genre of Always There : ");
            System.out.println(db.getGenreOfSong("Always There"));
            
            

    
        }
    
}
package lesson17;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        EnumMap<ClientAuthData.Role,List<ClientAuthData>> clients = new EnumMap<>( ClientAuthData.Role.class);
        clients.put(ClientAuthData.Role.USER,new ArrayList<>());
        clients.put(ClientAuthData.Role.ADMIN,new ArrayList<>());
        clients.get(ClientAuthData.Role.USER)
                .add(new ClientAuthData("qqq","1111", ClientAuthData.Role.USER));
        add(clients,new ClientAuthData("www","1111", ClientAuthData.Role.MODERATOR));

    }
    static List <String> getCities(HashMap<String,Integer>map, int max){
       ArrayList<String> cities = new ArrayList<>();
      for (Map.Entry<String,Integer> entity: map.entrySet()){
          if (entity.getValue()<max){
              cities.add(entity.getKey());
          }
      }
        return cities;
    }
    public static void add(EnumMap<ClientAuthData.Role,List<ClientAuthData>> map,ClientAuthData authData){
        map.computeIfAbsent(authData.getRole(), k -> new ArrayList<>());
               map.get(authData.getRole()).add(authData);

        }
        TreeMap <String,List<Integer>> students =new TreeMap<>();

    }


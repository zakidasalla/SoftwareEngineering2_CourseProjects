import java.util.*;

public class UnliCallTextPackage implements UnliCallTextOffer{
    private static Map<String, String> packageMap = new HashMap<>();

    static{
        packageMap.put("Smart", "You will be charged per use.");
        packageMap.put("Globe", " to subscribers within their network. Calls and texts to other networks are charged extra.");
        packageMap.put("Ditto", " to all networks within the country.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText){
        if (unliCallText) {
            return "This plan comes with unlimited calls and texts" + packageMap.get(telcoName);
        } else {
            return "This plan do not offer any free calls or texts" + packageMap.get(telcoName);
        }
    }

}
package server;

public class CheckMsg {
    public static String result (String Msg) {
        var normalizMsg = Msg.replaceAll("\n",":");
        var indexTwoPoint = normalizMsg.indexOf(":");
        var bodyMsg  = normalizMsg.substring(indexTwoPoint+1);
        var bodyMsgleght = bodyMsg.length();
        int headerBody;
        try {
            headerBody = Integer.parseInt(Msg.substring(0, indexTwoPoint));
            if (headerBody==bodyMsgleght){
            return "2\nok";
            } else {
                return "3\nerr";
            }
        }
        catch (NumberFormatException e) {
            return "3\nerr";
        }
    }
}

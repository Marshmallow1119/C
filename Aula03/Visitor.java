@SuppressWarnings("CheckReturnValue")
public class Visitor extends CSVBaseVisitor<Object> {
   private static StringBuilder html = new StringBuilder();
    
    @Override
    public Void visitRow(CSVParser.RowContext ctx) {
        html.append("<tr>\n");
        for (CSVParser.FieldContext field : ctx.field()) {
            html.append(" <td>").append(field.TEXT().getText()).append("</td>\n");
        }
        html.append("</tr>\n");
        return null;
    }
    
    public static void startTable() {
        html.append("<table>\n");
    }

    // Method to finalize the table
    public static void endTable() {
        html.append("</table>\n");
    }
    
    public static String getHtml() {
        return html.toString();
    }
}

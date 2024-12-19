public class TransactionID {
    public static void main(String[] args) {
        String html = """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Transactions</title>
            </head>
            <body>
                <div>
                    <div class="button">
                        <p>Transaction Id: TXN1234</p>
                    </div>
                </div>
            </body>
            </html>
        """;

        String[] arr = html.split("Transaction Id:");
        if (arr.length == 2) {
            String tId = arr[1].split("</p>")[0]; // Extract TXN1234
            System.out.println("Transaction Id:" + tId);
        } else {
            System.out.println("Not found");
        }
    }
}

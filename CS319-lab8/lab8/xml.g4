lexer grammar xml;

@lexer::members {
  boolean tag = false;
  boolean closeTag = false;
  String tagName = "";
}

fragment DIGIT: [0123456789];
fragment ALPHA: [a-zA-Z];
//fragment ALPHANUM: (DIGIT | ALPHA)+;
fragment SPECIALCHAR: [-_~!$&'()*+,;=:];


//3.1
fragment ELEMENTNAME: (('x' | 'X' 'm' | 'M' ((DIGIT | '_' | '-' | '.' | [a-kA-Km-zM-Z]) (DIGIT | '_' | '-' | '.' | ALPHA)*)? ) | (('x' | 'X') ((DIGIT | '_' | '-' | '.' | [a-lA-Ln-zN-Z]) (DIGIT | '_' | '-' | '.' | ALPHA)*)? ) | (([a-wA-Wy-zY-Z] | '_') (DIGIT | '_' | '-' | '.' | ALPHA)*));

//3.2
fragment LOCAL: (DIGIT | ALPHA | SPECIALCHAR) ((DIGIT | ALPHA | SPECIALCHAR) | '.' (DIGIT | ALPHA | SPECIALCHAR))*;
fragment DOMAIN: [0-9a-zA-Z.-]+;

//3.3
fragment DATE: [3] [01] | [1-2] [0-9] | '0'? [1-9];
fragment MONTH: [1] [0-2] | '0'? [1-9];
fragment YEAR: ('20' [0-9] [0-9]) | '2100';

//3.4
fragment THREEDIGIT: DIGIT DIGIT DIGIT;
fragment FOURDIGIT: DIGIT DIGIT DIGIT DIGIT;

//3.5
fragment VISA: '4' ((FOURDIGIT FOURDIGIT FOURDIGIT THREEDIGIT) | (THREEDIGIT THREEDIGIT THREEDIGIT THREEDIGIT));
fragment MASTER: '5' [1-5] FOURDIGIT FOURDIGIT FOURDIGIT DIGIT DIGIT;
fragment AMERICANEXP: '3' ('4' | '7') FOURDIGIT FOURDIGIT FOURDIGIT DIGIT;
fragment DINERSCLUB: (('30' [0-5]) THREEDIGIT THREEDIGIT THREEDIGIT DIGIT DIGIT) | (('36' | '38') THREEDIGIT THREEDIGIT THREEDIGIT THREEDIGIT );
fragment DISCOVER: ('6011' FOURDIGIT FOURDIGIT FOURDIGIT) | ('65' FOURDIGIT FOURDIGIT FOURDIGIT DIGIT DIGIT);
fragment JCB: (('2131'|'1800') THREEDIGIT THREEDIGIT THREEDIGIT DIGIT DIGIT) | ('35' THREEDIGIT THREEDIGIT THREEDIGIT FOURDIGIT DIGIT);


//STARTING: '</' {tag = true;} | '<' {tag = true;};
//STOPPING: '>' {tag = false;};

//ELEMENTTAG: {tag}? ELEMENTNAME {
//
//  tagName = getText();
//  System.out.println("Element Name: " + getText());
//
//};

ELEMENTTAG: '<' ELEMENTNAME '>' .*? '</' ELEMENTNAME '>'
{
  tag = false;
  String output = getText().substring(1, getText().length() - 1);
  tagName = output;
  System.out.println("Starting Element Name: " + output);
} -> more, pushMode(INSIDE);

mode INSIDE;

EMAIL: {!tag && tagName.matches("(?i)email")}? LOCAL '@' DOMAIN {
  System.out.println("Email: " + getText());
} -> popMode;

DATETEST: {!tag && tagName.matches("(?i)date")}? DATE '/' MONTH '/' YEAR {
  System.out.println("Date: " + getText());
} -> popMode;

PHONE: {!tag && tagName.matches("(?i)phone")}?
((THREEDIGIT '-' THREEDIGIT '-' FOURDIGIT) | ( '(' THREEDIGIT ')' THREEDIGIT '-' FOURDIGIT) | (THREEDIGIT ' ' THREEDIGIT ' ' FOURDIGIT) | (THREEDIGIT '.' THREEDIGIT '.' FOURDIGIT))
{
  System.out.println("Phone: " + getText());
} -> popMode;

CREDITCARD: {!tag && tagName.matches("(?i)creditcard")}? (VISA | MASTER | AMERICANEXP | DINERSCLUB | DISCOVER | JCB) {
  System.out.println("Credit Card: " + getText());
} -> popMode;

OTHER: {!tag && !tagName.matches("(?i)email") && !tagName.matches("(?i)date") && !tagName.matches("(?i)phone") && !tagName.matches("(?i)creditcard")}? (DIGIT | ALPHA| SPECIALCHAR | ' ')+ {System.out.println("Other: " + "TAG: " + tagName + " " + getText());} -> popMode;

WS: [ \r\t\n]+ {System.out.println("matching WS rule");skip();} -> popMode;

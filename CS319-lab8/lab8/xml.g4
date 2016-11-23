lexer grammar xml;

@lexer::members {
  boolean tag = false;
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
fragment DOMAIN: [0-9a-zA-Z.]+;

//3.3
fragment DATE: [1-9] | [1-2] [0-9] | [3] [01];
//fragment MONTH:

STARTING: '</' {tag = true;} | '<' {tag = true;};
STOPPING: '>' {tag = false;};



ELEMENTTAG: {tag}? ELEMENTNAME {

  tagName = getText();
  System.out.println("Element Name: " + getText());

};

EMAIL: {!tag && tagName.matches("(?i)email")}? LOCAL '@' DOMAIN {
  System.out.println("Email: " + getText());
};

//DATETEST: DATE '/' {
//  System.out.println("Date: " + getText());
//};


WS: [ \r\t\n]+ {System.out.println("matching WS rule");skip();};

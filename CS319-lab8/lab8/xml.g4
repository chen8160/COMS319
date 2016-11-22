lexer grammar xml;

@lexer::members {
  int total = 0;
}

fragment DIGIT: [0123456789];
fragment ALPHA: [a-zA-Z];
fragment ALPHANUM: (DIGIT | ALPHA)+;
fragment SPECIALCHAR: ('-' | '_' | '~' | '!' | '$' | '&' | ''' | '(' | ')' | '*' | '+' | ',' | ';' | '=' | ':' );


fragment ELEMENTNAME: (('x' | 'X' 'm' | 'M' ((DIGIT | '_' | '-' | '.' | [a-kA-Km-zM-Z]) (DIGIT | '_' | '-' | '.' | ALPHA)*)? ) | (('x' | 'X') ((DIGIT | '_' | '-' | '.' | [a-lA-Ln-zN-Z]) (DIGIT | '_' | '-' | '.' | ALPHA)*)? ) | (([a-wA-Wy-zY-Z] | '_') (DIGIT | '_' | '-' | '.' | ALPHA)*));

fragment LOCAL: (ALPHANUM | SPECIALCHAR)



ELEMENTTAG: '<' ELEMENTNAME? '>' {

  String output = getText().substring(1, getText().length() - 1);
  System.out.println("Starting Element Name: " + output);

}
| '</' ELEMENTNAME? '>' {

  output = getText().substring(2, getText().length() - 1);
  System.out.println("Stopping Element Name: " + output);

};


WS: [ \r\t\n]+ {System.out.println("matching WS rule");skip();};

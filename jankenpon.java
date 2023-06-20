// ************* RULES OF JUN KEN PON ******************* 
// 1 == ROCK ; 2 == PAPER ; 3 == SCISSORS
// PLAYERS: user vs. IA
// If user choose 1 and IA choose 1, then: TIE == SUB 0
// If user choose 1 and IA choose 2, then: IA WIN == SUB -1
// If user choose 1 and IA choose 3, then: user WIN == SUB -2
// If user choose 2 and IA choose 1, then: user WIN == SUB 1
// If user choose 2 and IA choose 2, then: TIE == SUB 0
// If user choose 2 and IA choose 3, then: IA WIN == SUB -1
// If user choose 3 and IA choose 1, then: IA WIN == SUB 2
// If user choose 3 and IA choose 2, then: user WIN == SUB 1
// If user choose 3 and IA choose 3, then: TIE == SUB 0
// then user WIN if SUB == -2 or 1 
// and then IA WIN if SUB == -1 or 2
// if SUB == O then is a TIE.



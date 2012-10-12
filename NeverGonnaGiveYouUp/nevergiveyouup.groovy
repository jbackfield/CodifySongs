def Never = false

class RickAstley {
  def giveYouUp(val) { }
  def letYouDown(val) { }
  def runAroundAndDesertYou(val) { }
  def makeYouCry(val) { }
  def sayGoodby(val) { }
  def tellALieAndHurtYou(val) { }
  static def is(block) {
    def ra = new RickAstley()
    ra.with block
  }
}

RickAstley.is {
  giveYouUp Never
  letYouDown Never
  runAroundAndDesertYou Never
  makeYouCry Never
  sayGoodby Never
  tellALieAndHurtYou Never
}

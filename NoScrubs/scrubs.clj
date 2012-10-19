(defn isScrub [son]
  (if 
    (or 
      (and (get son :car) (get son :walking))
      (= (get son :home) :mommas)
      (and (get son :shorty) (not (get son :showsLove)))
      (or (not (get son :money)) (<= (get son :money) 0))
    )
    true
    false
  )
)

(defn getLoveFrom [me boy]
  (get
    (if
      (= (isScrub boy) true)
      (assoc
        (assoc
          (assoc
            (assoc
              (assoc boy :doYouWantMyNumber false)
              :willYouGiveMeYours false)
            :doYouWantToMeetMeSomewhere false)
          :doYouWantAnyOfMyTime false)
        :getsLove false)
      (assoc boy :getsLove true)
    )
  :getsLove)
)

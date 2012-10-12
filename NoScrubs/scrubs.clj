(defn isScrub [scrub]
  (if 
    (or 
      (and (get scrub :car) (get scrub :walking))
      (= (get scrub :home) :mommas)
      (and (get scrub :shorty) (not (get scrub :showsLove)))
      (or (not (get scrub :money)) (<= (get scrub :money) 0))
    )
    true
    false
  )
)

(defn getLoveFrom [me scrub]
  (get
    (if
      (= (isScrub scrub) true)
      (assoc
        (assoc
          (assoc
            (assoc
              (assoc scrub :doYouWantMyNumber false)
              :willYouGiveMeYours false)
            :doYouWantToMeetMeSomewhere false)
          :doYouWantAnyOfMyTime false)
        :getsLove false)
      (assoc scrub :getsLove true)
    )
  :getsLove)
)

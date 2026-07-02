(ns model-checking
  "KAMI Verify — formal verification (equivalence checking, model
  checking, SVA assertions) and coverage analysis for digital designs.
  Restored from the legacy kami-engine/kami-verify Rust crate (deleted in
  kotoba-lang/kami-engine PR #82 'Remove Rust workspace from
  kami-engine') as part of the clj-wgsl migration (ADR-2607010930,
  com-junkawasaki/root).

  Named `model-checking` (not `verify`) to avoid the generic-verb
  collision risk `verify` carries in a large, actively-developed org —
  same class of correction as `kami-si` -> `signal-integrity`.

  Zero-dep portable CLJC. Restoration pending.")
